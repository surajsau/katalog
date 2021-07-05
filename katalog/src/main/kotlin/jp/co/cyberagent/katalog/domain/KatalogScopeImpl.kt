package jp.co.cyberagent.katalog.domain

import jp.co.cyberagent.katalog.dsl.ComposeDefinition
import jp.co.cyberagent.katalog.dsl.Group
import jp.co.cyberagent.katalog.dsl.GroupDefinition
import jp.co.cyberagent.katalog.dsl.KatalogScope
import jp.co.cyberagent.katalog.ext.KatalogExt

internal class KatalogScopeImpl : KatalogScope {
    companion object {
        private const val DEFAULT_TITLE = "UI Catalog"
    }

    private val groupScope: GroupScopeImpl = GroupScopeImpl()
    private val extensions = mutableListOf<KatalogExt>()

    override var title: String = DEFAULT_TITLE

    override fun group(name: String, definition: GroupDefinition) {
        groupScope.group(name, definition)
    }

    override fun group(vararg group: Group) {
        groupScope.group(*group)
    }

    override fun compose(name: String, definition: ComposeDefinition) {
        groupScope.compose(name, definition)
    }

    override fun addExtension(ext: KatalogExt) {
        extensions.add(ext)
    }

    fun build(): Katalog {
        return Katalog(
            title = title,
            items = groupScope.items,
            extensions = Extensions(extensions)
        )
    }
}
