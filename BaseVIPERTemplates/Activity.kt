package ${package_name}

import android.os.Bundle

class ${module_name}Activity : BaseActivity<${module_name}Contract.Presenter>(), ${module_name}Contract.View {

    //region Properties
    override var presenter: ${module_name}Contract.Presenter? = null
    //endregion

    //region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_${lowercase_module_name})
    }
    //endregion

    //region ${module_name}Contract.View
    override fun setupView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    //endregion
}