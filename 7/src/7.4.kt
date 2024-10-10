import kotlin.random.Random
data class Card(val rank: String, val suit: String) {
    fun value(): Int {
        return when (rank) {
            "A" -> 11
            "K", "Q", "J" -> 10
            else -> rank.toInt()
        }
    }
}
class Deck {
    private val suits = listOf("Hearts", "Diamonds", "Clubs", "Spades")
    private val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
    private val cards: MutableList<Card> = mutableListOf()
    init {
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
        shuffle()
    }
    fun shuffle() {
        cards.shuffle()
    }
    fun draw(): Card {
        return cards.removeAt(cards.size - 1)
    }
}
class Player(val name: String) {
    private val hand: MutableList<Card> = mutableListOf()

    fun addCard(card: Card) {
        hand.add(card)
    }
    fun handValue(): Int {
        var value = hand.sumOf { it.value() }
        // Корректировка для тузов
        hand.filter { it.rank == "A" }.forEach { if (value > 21) value -= 10 }
        return value
    }
    fun showHand() {
        println("$name's hand: ${hand.joinToString { "${it.rank} of ${it.suit}" }} (Value: ${handValue()})")
    }
    fun clearHand() {
        hand.clear()
    }
}
fun main() {
    val deck = Deck()
    val player = Player("Player")
    val dealer = Player("Dealer")
    for (i in 1..2) {
        player.addCard(deck.draw())
        dealer.addCard(deck.draw())
    }
    player.showHand()
    dealer.showHand()
    while (true) {
        println("Хотите взять карту? (y/n)")
        if (readLine() != "y") break
        player.addCard(deck.draw())
        player.showHand()
        if (player.handValue() > 21) {
            println("Вы проиграли! Перебор.")
            return
        }
    }
    while (dealer.handValue() < 17) {
        dealer.addCard(deck.draw())
    }
    player.showHand()
    dealer.showHand()
    when {
        dealer.handValue() > 21 -> println("Дилер перебрал! Вы выиграли!")
        player.handValue() > dealer.handValue() -> println("Вы выиграли!")
        dealer.handValue() > player.handValue() -> println("Дилер выиграл!")
        else -> println("Ничья!")
    }
}