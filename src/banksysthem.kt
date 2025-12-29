class BankAccount(val accountNumber : String , var ownerName : String , var balance : Double){
    fun deposit(amount : Double){
        balance += amount
    }
    fun witdhraw(amount : Double){
        if (amount>balance || amount > 0.0){
            println(" Solde insuffisant !!")
        }else{
            balance -= amount
        }
    }
    fun displayBalance(){
        println("Account Number: $accountNumber")
        println("Owner: Mr/Ms $ownerName")
        println("Balance: $balance DH ")
    }
}
fun main() {
    val account = BankAccount("1", "Tarik Oulehiane", 1000.0)
    while (true) {
        println("BANK MENU : ")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Show Balance")
        println("4. Exit")
        print("Choose: ")
        when (readLine()) {
            "1" -> {
                print("Enter amount: ")
                val amount = readLine()!!.toDouble()
                account.deposit(amount)
            } "2" -> {
                print("Enter amount: ")
                val amount = readLine()!!.toDouble()
                account.witdhraw(amount)
            }
                "3" -> account.displayBalance()
                "4" -> break
            else -> println("Invalid choice")
        }
    }
}