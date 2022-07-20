package ${package_name}

interface ${module_name}Contract {

    interface View {

        var presenter: Presenter?

        fun setupView()

    }

    interface Presenter {

        var view: View?
        var interactor: Interactor?
        var router: Router?
        
        fun onCreate()
        fun onDestory()
    }
    
    interface Router {
        var view: View?
    }

    interface InteractorOutput {

    }

    interface Interactor {
        var output: InteractorOutput?
    }
    
}