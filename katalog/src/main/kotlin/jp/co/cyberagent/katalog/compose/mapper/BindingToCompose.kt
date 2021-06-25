package jp.co.cyberagent.katalog.compose.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.viewbinding.ViewBinding
import jp.co.cyberagent.katalog.domain.ParamsFactory
import jp.co.cyberagent.katalog.dsl.BindingFactoryDefinition
import jp.co.cyberagent.katalog.dsl.BindingUpdateDefinition

@Composable
internal fun <T : ViewBinding> BindingToCompose(
    factory: BindingFactoryDefinition<T>,
    paramsFactory: ParamsFactory,
    layoutParams: ViewGroup.LayoutParams? = null,
    update: BindingUpdateDefinition<T> = {}
) {
    ViewToCompose(paramsFactory, layoutParams) {
        val inflater = LayoutInflater.from(it)
        val binding = factory.invoke(inflater, null, false)
        update.invoke(binding, it)
        binding.root
    }
}
