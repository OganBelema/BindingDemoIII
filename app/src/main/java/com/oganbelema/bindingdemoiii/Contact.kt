package com.oganbelema.bindingdemoiii

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Contact: BaseObservable(){

    @Bindable
    var id: Int = 0
        set(value){
            field = value
            notifyPropertyChanged(BR.id)
        }

    @Bindable
    var name: String = ""
        set(value){
        field = value
        notifyPropertyChanged(BR.name)
        }

    @Bindable
    var email: String = ""
        set(value) {
        field = value
        notifyPropertyChanged(BR.email)
        }

}