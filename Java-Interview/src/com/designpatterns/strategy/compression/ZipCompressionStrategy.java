package com.designpatterns.strategy.compression;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

//	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("Compressing files using Zip");
	}

}
