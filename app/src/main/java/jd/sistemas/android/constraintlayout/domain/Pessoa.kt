package jd.sistemas.android.constraintlayout.domain

import java.io.Serializable

/**
 * É importante ressaltar que por utilizar o recurso de reflection do Java, o uso da interface Serializable é bem mais lento que
 * @see android.os.Parcelable
 * Mas, isso só é perceptivel quando utilizamos objetos maiores ou listas de objetos.
 */
data class Pessoa(
    var nome: String, var idade: Int
) : Serializable