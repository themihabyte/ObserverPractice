package m.novikov.io.github.themihabyte.observerpractice.mainscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text

    fun onTextUpdated(s: CharSequence) {
        if (_text.value != null) _text.value = s.toString()
    }
}