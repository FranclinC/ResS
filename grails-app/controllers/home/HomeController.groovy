package home

import user.User

class HomeController {

    def index()
    {
        render(view: "index");
    }

    def login()
    {
        User user = new User();
        render(view: "login", model: [user : user]);
    }
}
