package org.mozilla.fenix.components.toolbar

interface PasteAndGoInteractor {
    fun onBrowserToolbarPaste(text: String)
    fun onBrowserToolbarPasteAndGo(text: String)
}