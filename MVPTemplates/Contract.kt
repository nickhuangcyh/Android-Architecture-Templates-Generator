package ${package_name}

interface ${module_name}Contract {

    interface View {

        var presenter: Presenter?

        fun setupView()

    }

    interface Presenter {

        var view: View?
        var interactor: Interactor?
        
        fun onDestory()
    }

    interface Interactor {

    }
    
}