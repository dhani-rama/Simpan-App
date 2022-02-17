package id.vedc.simpan.model

import com.google.gson.annotations.SerializedName

class dataPegawai (

	@field:SerializedName("pendidikan")
	val pendidikan: String? = null,

	@field:SerializedName("jabatan")
	val jabatan: String? = null,

	@field:SerializedName("agama")
	val agama: String? = null,

	@field:SerializedName("photo")
	val photo: String? = null,

	@field:SerializedName("ruang")
	val ruang: String? = null,

	@field:SerializedName("pangkat")
	val pangkat: String? = null,

	@field:SerializedName("kelas_tunkin")
	val kelasTunkin: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("NIP")
	val nIP: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("tempat_lahir")
	val tempatLahir: String? = null,

	@field:SerializedName("golongan")
	val golongan: String? = null,

	@field:SerializedName("gelar_belakang")
	val gelarBelakang: String? = null,

	@field:SerializedName("id_pegawai")
	val idPegawai: String? = null,

	@field:SerializedName("bup")
	val bup: String? = null,

	@field:SerializedName("gelar_depan")
	val gelarDepan: String? = null,

	@field:SerializedName("jenis_kelamin")
	val jenisKelamin: String? = null,

	@field:SerializedName("tanggal_lahir")
	val tanggalLahir: String? = null
)
