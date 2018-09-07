package mx.cetys.arambula.angel.micampus.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class Perfil(
        @SerializedName("id")
        val id: String,
        @SerializedName("matricula")
        val matricula: String,
        @SerializedName("contrasena")
        val password: String,
        @SerializedName("Nombre")
        val nombre: String,
        @SerializedName("Apellido")
        val apellido: String,
        @SerializedName("Carrera")
        val carrera: String,
        @SerializedName("Semestre")
        val semestre: Int,
        @SerializedName("materiasaprobadas")
        val materiasaprobadas: Int,
        @SerializedName("Padre")
        val padre: Tutor,
        @SerializedName("Madre")
        val madre: Tutor
) :  Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readInt(),
                parcel.readInt(),
                parcel.readParcelable(Tutor::class.java.classLoader),
                parcel.readParcelable(Tutor::class.java.classLoader)) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeString(id)
                parcel.writeString(matricula)
                parcel.writeString(password)
                parcel.writeString(nombre)
                parcel.writeString(apellido)
                parcel.writeString(carrera)
                parcel.writeInt(semestre)
                parcel.writeInt(materiasaprobadas)
                parcel.writeParcelable(padre, flags)
                parcel.writeParcelable(madre, flags)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<Perfil> {
                override fun createFromParcel(parcel: Parcel): Perfil {
                        return Perfil(parcel)
                }

                override fun newArray(size: Int): Array<Perfil?> {
                        return arrayOfNulls(size)
                }
        }
}

