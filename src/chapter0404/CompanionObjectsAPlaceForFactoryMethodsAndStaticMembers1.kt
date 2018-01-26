package chapter0404

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    println(subscribingUser.nickname)
    val facebookUser = User.newFacebookUser(4)
    println(facebookUser.nickname)
}
