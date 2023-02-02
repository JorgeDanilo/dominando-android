package jd.sistemas.android.constraintlayout.domain

import android.os.Parcel
import android.os.Parcelable


/**
 * Parcelable recomendado pelo Google, contudo existe uma forma mais simples de passagem de parametros de objetos via intentes
 * @see java.io.Serializable
 */
class Cliente(
    var codigo: Int, var nome: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    )

    /**
     * Serve para serializar (transformar em bytes os atributos da class.
     */
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(codigo)
        parcel.writeString(nome)
    }

    /**
     * Serve de identificador único dessa classe no projeto
     */
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cliente> {
        override fun createFromParcel(parcel: Parcel): Cliente {
            return Cliente(parcel)
        }

        override fun newArray(size: Int): Array<Cliente?> {
            return arrayOfNulls(size)
        }
    }
}