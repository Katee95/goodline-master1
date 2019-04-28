class BisinessLogic {
    /*Функция которая работает с Cmd и с коллекцией */
    fun authentication(cmd: Cmd, users: List<User>): Int {
        if (commands.h) {
            CmdService().h()
            System.exit(1)
        }
        //Написать условие если Login указан неверно


        val user = UserService().findUserByLogin(users, commands.login)
        if (user != null) {
            if (UserService().ValidatePass(commands.pass, user)) System.exit(0)
            else System.exit(4)
        } else System.exit(3)
    }
}