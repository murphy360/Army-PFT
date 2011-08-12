package com.andrios.apft;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.content.Context;
import android.widget.Toast;


public class AndriosData implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6149357292077176082L;

	
	
	//Male
	
	int[] weightMale = {131, 136, 141, 145, 150, 155,
			160, 165, 170, 175, 180, 186, 191, 197, 202, 208, 214, 220, 225, 231, 237,
			244, 250};
			
	//PFT
	int[] pushupMale17 = {9, 10, 12, 13, 14, 16, 17, 19, 20, 21, 23, 24, 26, 27, 28, 30, 31, 32, 34, 35, 37, 38, 
			39, 41, 42, 43, 45, 46, 48, 49, 50, 52, 53, 54, 56, 57, 59, 60, 61, 63, 64, 66, 67, 68,
			70, 71, 72, 74, 75, 77, 78, 79, 81, 82, 83, 85, 86, 88, 89, 90, 92, 93, 94, 96, 97, 99};
	int[] pushupMale22 = {20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 41,
			42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57, 58, 59, 60, 61, 62, 63, 65, 66, 67, 68, 69, 70,
			71, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 94,
			95, 97, 98, 99};
	int[] pushupMale27 = {24, 25, 26, 27, 28, 29, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
			44, 45, 46, 47, 48, 49, 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 71, 72,
			73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	int[] pushupMale32 = {28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
			52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 
			79, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	int[] pushupMale37 = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 
			55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83,
			84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	int[] pushupMale42 = {32, 33, 34, 36, 37, 38, 39, 40, 41, 42, 43, 44, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 96, 97, 98, 99};
	int[] pushupMale47 = {36, 38, 39, 40, 41, 42, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 58, 59, 60, 61, 62, 63, 64,
			65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 78, 79, 80, 81, 82, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 98, 99};
	int[] pushupMale52 = {43, 44, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	
	/* 
	 * Omitted because people here are too old. 
	int[] pushupMale57 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	
	
	int[] pushupMale62 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	*/
	
	// 1  2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18   19    20   21
	//60 120 180 240 300 360 420 480 540 600 660 720 780 840 900 960 1020 1080 1140 1200 1260
	int[] runMale17 = {0, 0, 0, 0, 0, 1, 2, 3, 5, 6, 8, 9, 10, 12, 13, 14, 17, 18, 19, 20, 21, 23, 24, 26,
			27, 28, 30, 31, 32, 34, 35, 37, 38, 39, 41, 42, 43, 45, 46, 48, 49, 50, 52, 53, 54, 56, 57,
			59, 60, 61, 63, 64, 66, 67, 68, 70, 71, 72, 74, 75, 77, 78, 79, 81, 82, 83, 85, 86, 
			88, 89, 90, 92, 93, 94, 96, 97, 99 };
	int[] runMale22 = {14, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26,
			27, 28, 29, 30, 31, 32, 33, 34, 36, 37, 38, 39, 40, 41, 42, 43, 44, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 96, 97, 98, 99};
	int[] runMale27 = {19, 20, 21, 22, 23, 24, 25,
			28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 94, 95, 96, 97, 98, 99 };
	int[] runMale32 = {33, 34, 35, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 85, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 95, 96, 97, 98, 99 };
	int[] runMale37 = {40, 40, 41, 42, 43, 44, 45, 46, 46, 47, 48, 49, 50, 51, 51, 52, 53, 54, 55, 56, 57, 57,
			58, 59, 60, 61, 62, 63, 63, 64, 65, 66, 67, 68, 69, 69, 70, 71, 72, 73, 74, 74, 75, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84, 85, 86, 86, 87,
			88, 89, 90, 91, 91, 92, 93, 94, 95, 96, 97, 97, 98, 99 };
	int[] runMale42 = {43, 43, 44, 45, 46, 47, 48, 49, 50, 50, 51, 52, 53, 54, 55, 56, 57, 57,
			58, 59, 60, 61, 62, 63, 63, 64, 65, 66, 67, 68, 69, 70, 70, 71, 72, 73, 74, 75, 76, 77, 77, 78, 79, 80, 81, 82, 83, 83, 84, 85, 86, 87,
			88, 89, 89, 90, 91, 92, 93, 94, 95, 96, 97, 97, 98, 99};
	int[] runMale47 = {51, 51, 52, 53, 54, 55, 55, 56, 57,
			58, 58, 59, 60, 61, 62, 62, 63, 64, 65, 65, 66, 67, 68, 69, 69, 70, 71, 72, 73, 73, 74, 75, 76, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84, 84, 85, 86, 87, 87,
			88, 89, 90, 91, 91, 92, 93, 94, 95, 95, 96, 97, 98, 98, 99 };
	int[] runMale52 = {53, 54, 55, 55, 56, 57, 58,
			58, 59, 60, 61, 62, 62, 63, 64, 65, 65, 66, 67, 68, 69, 69, 70, 71, 72, 73, 73, 74, 75, 76, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84, 84, 85, 86, 87, 87,
			88, 89, 90, 91, 91,  92, 93, 94, 95, 95, 96, 97, 98, 98, 99 };
	
	/*
	int[] runMale55 = {};
	int[] runMale60 = {};
	int[] runMale65 = {};
	*/
	
	// 1  2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18   19    20   21
	//60 120 180 240 300 360 420 480 540 600 660 720 780 840 900 960 1020 1080 1140 1200 1260
	

	//Female
	int[] weightFemale = {119, 124, 128, 132, 136, 141, 145,
			150, 155, 159, 164, 169, 174, 179, 184, 189, 194, 200, 205, 210, 216, 221, 227};
	
	//PFT
	int[] pushupFemale17 = {36, 37, 39, 41, 43, 44, 46, 48, 50, 51, 53, 55, 57,
			58, 60, 62, 63, 65, 67, 69, 70, 72, 74, 76, 77, 79, 81, 83, 84, 86,
			88, 90, 91, 93, 95, 97, 98};
	int[] pushupFemale22 = {43, 45, 45, 48, 49, 49, 50, 52, 54, 56, 57,
			59, 60, 61, 63, 64, 66, 67, 68, 70, 71, 72, 74, 75, 77, 78, 79, 81, 82, 83, 85, 86,
			88, 89, 90, 92, 93, 94, 96, 97, 99};
	int[] pushupFemale27 = {45, 47, 48, 49, 49, 50, 52, 54, 55, 56,
			58, 59, 60, 61, 62, 64, 65, 66, 67, 68, 70, 71, 72, 73, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 87,
			88, 89, 90, 92, 93, 94, 95, 96, 98, 99};
	int[] pushupFemale32 = {47, 48, 49, 49, 50, 52, 54, 58,
			58, 59, 60, 61, 63, 64, 65, 67, 68, 69, 71, 72, 73, 75, 76, 77, 79, 80, 81, 83, 84, 85, 87,
			88, 89, 91, 92, 93, 95, 96, 97, 99};
	int[] pushupFemale37 = {48, 50, 51, 53, 54, 56, 57,
			59, 60, 61, 63, 64, 66, 67, 69, 70, 72, 73, 75, 76, 78, 79, 81, 82, 84, 85, 87,
			88, 90, 91, 93, 94, 96, 97, 99};
	int[] pushupFemale42 = {49, 50, 52, 54, 55, 57,
			58, 60, 62, 63, 65, 66, 68, 70, 71, 73, 74, 76, 78, 79, 81, 82, 84, 86, 87,
			88, 89, 90, 92, 94, 95, 97, 98};
	int[] pushupFemale47 = {52, 53, 55, 57,
			58, 60, 62, 63, 65, 67, 68, 70, 72, 73, 75, 77, 78, 80, 82, 83, 85, 87,
			88, 90, 92, 93, 95, 97, 98};
	int[] pushupFemale52 = {53, 55, 56,
			58, 60, 62, 64, 65, 67, 69, 71, 73, 75, 76, 78, 80, 82, 84, 85, 87,
			89, 91, 93, 95, 96, 98};
	
	/*
	int[] pushupFemale57 = {};
	int[] pushupFemale60 = {};
	int[] pushupFemale65 = {};
	*/
	
	int[] situp17 = {9, 10, 12, 14, 15, 17, 18, 20, 22, 23, 25, 26, 28, 30, 31,
			33, 34, 36, 38, 39, 41, 42, 44, 45, 47, 49, 50, 52, 54, 55, 57,
			58, 60, 62, 63, 65, 66, 68, 70, 71, 73, 74, 76, 78, 79, 81, 82, 84, 87,
			88, 89, 90, 92, 94, 95, 97, 98};
	int[] situp22 = {21, 23, 24, 25,27, 28, 29, 31,
			32, 33, 35, 36, 37, 39, 40, 41, 43, 44, 45, 47, 48, 49, 50, 52, 53, 55, 56, 57,
			58, 59, 60, 61, 63, 64, 65, 67, 68, 69, 71, 72, 73, 75, 76, 77, 79, 80, 81, 83, 84, 85, 87,
			88, 89, 91, 92, 93, 95, 96, 97, 99};
	int[] situp27 = {34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 94, 95, 96, 97, 98, 99};
	int[] situp32 = {35, 36, 38, 39, 40, 41, 42, 44, 45, 46, 47, 48, 49, 50, 52, 53, 54, 55, 56,
			58, 59, 60, 61, 62, 64, 65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 78, 79, 80, 81, 82, 84, 85, 86, 87,
			88, 89, 91, 92, 93, 94, 95, 96, 98, 99};
	int[] situp37 = {42, 43, 44, 45, 46, 47, 48, 49, 50, 52, 53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	int[] situp42 = {49, 50, 51, 52, 53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	int[] situp47 = {50, 51, 52, 53, 54, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 84, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 96, 97, 98, 99};
	int[] situp52 = {53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	
	/*
	int[] situpFemale55 = {};
	int[] situpFemale60 = {};
	int[] situpFemale65 = {};
	*/
	
	// 1  2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18   19    20   21
	//60 120 180 240 300 360 420 480 540 600 660 720 780 840 900 960 1020 1080 1140 1200 1260
	int[] runFemale17 = {38, 39, 41, 42, 43, 44, 45, 47, 48, 49, 50, 52, 53, 54, 55, 56,
			58, 59, 60, 61, 62, 64, 65, 66, 67, 68, 70, 71, 72, 73, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 87,
			88, 89, 90, 92, 93, 94, 95, 96, 98, 99};
	int[] runFemale22 = {49, 50, 51, 52, 53, 54, 55, 56, 57,
			58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
			88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
	int[] runFemale27 = {58, 59, 60, 61, 62, 63, 63, 64, 65, 66, 67, 68, 69, 69, 70, 71, 72, 73, 74, 74, 75, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84, 85, 86, 86, 87,
			88, 89, 90, 91, 91, 92, 93, 94, 95, 96, 97, 97, 98, 99 };
	int[] runFemale32 = {67, 68, 68, 69, 70, 70, 71, 72, 72, 73, 74, 74, 75, 76, 77, 77, 78, 79, 79, 80, 81, 81, 82, 83, 83, 84, 85, 86, 86, 87,
			88, 88, 89, 90, 90, 91, 92, 92, 93, 94, 94, 95, 96, 97, 97, 98, 99, 99};
	int[] runFemale37 = {74, 75, 75, 76, 77, 78, 78, 79, 80, 80, 81, 82, 82, 83, 84, 85, 85,  86, 87, 87, 
			88, 89, 89, 90, 91, 92, 92, 93, 94, 94, 95, 96, 96, 97, 98, 99, 99 };
	int[] runFemale42 = {79, 80, 80, 81, 82, 82, 83, 83, 84, 85, 85, 86, 87, 87, 
			88, 89, 89, 90, 90, 91, 92, 92, 93, 94, 94, 95, 96, 96, 97, 97, 98, 99, 99 };
	int[] runFemale47 = {81, 81, 82, 82, 83, 84, 84, 85, 86, 86, 87, 87, 
			88, 89, 89, 90, 91, 91, 92, 92, 93, 94, 94, 95, 96, 96, 97, 97, 98, 99, 99 };
	int[] runFemale52 = {87, 88, 89, 90, 90, 91, 92, 93, 93, 94, 95, 96, 96, 97, 98, 99, 99 };
	
	/*
	int[] runFemale55 = {};
	int[] runFemale60 = {};
	int[] runFemale65 = {};
	*/
	
	// **********************  CFT   ******************************//
	
	//MTC
	
	int[]maleMTCMins = {165, 171, 183, 185}; //Times lower than this == 100pts (times in seconds)
	
	int[] maleMTC17 = {60, 61, 61, 62, 62, 63, 63, 63, 64, 64, 65, 65, 66, 66, 67, 67, 67, 68, 68, 69, 69, 70, 70, 71, 71, 71, 
						72, 72, 73, 73, 74, 74, 75, 75, 75, 76, 76, 77, 77, 78, 78, 79, 79, 79, 80, 80, 81, 81, 82, 82, 83,
						83, 83, 84, 84, 85, 85, 86, 86, 87, 87, 87, 88, 88, 89, 89, 90, 90 ,91, 91, 91, 92, 92, 93, 93, 94, 94, 
						95, 95, 95, 96, 96, 97, 97, 98, 98, 99, 99};
	
	int[] maleMTC27 = {60, 61, 61, 61, 62, 62, 63, 63, 63, 64, 64, 65, 65, 65, 66, 66, 67, 67, 67, 68, 68, 69, 69, 70, 70, 70, 
						71, 71, 72, 72, 72, 73, 73, 74, 74, 74, 75, 75, 76, 76, 76, 77, 77, 78, 78, 78, 79, 79, 80, 80, 80, 81, 
						81, 82, 82, 82, 83, 83, 84, 84, 84, 85, 85, 86, 86, 86, 87, 87, 88, 88, 88, 89, 89, 90, 90 ,91, 91, 91, 
						92, 92, 93, 93, 93, 94, 94, 95, 95, 95, 96, 96, 97, 97, 97, 98, 98, 99, 99};
	
	int[] maleMTC40 = {60, 61, 61, 61, 62, 62, 62, 63, 63, 63, 64, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68, 
						69, 69, 69, 70, 70, 70, 71, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 74, 75, 75, 75, 76, 76, 76, 77, 
						77, 77, 77, 78, 78, 78, 79, 79, 79, 80, 80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 83, 84, 84, 84, 84, 85, 
						85, 86, 86, 86, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 90, 91, 91, 91, 92, 92, 92, 93, 93, 93, 94, 94, 
						94, 95, 95, 95, 96, 96, 96, 97, 97, 97, 97, 98, 98, 98, 99, 99, 99, 99};
	
	int[] maleMTC46 = {60, 61, 61, 61, 62, 62, 62, 63, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68, 
						69, 69, 69, 70, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 74, 74, 75, 75, 75, 76, 76, 76, 77, 
						77, 77, 78, 78, 78, 79, 79, 79, 80, 80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 83, 84, 84, 84, 84, 85, 85,
						85, 86, 86, 86, 87, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 90, 91, 91, 91, 92, 92, 92, 93, 93, 93, 94, 
						94, 94, 95, 95, 95, 95, 96, 96, 96, 97, 97, 97, 98, 98, 98, 99, 99, 99, 99};
	
	int[]femaleMTCMins = {203, 210, 229, 235}; //Times lower than this == 100pts (times in seconds)
	
	int[] femaleMTC17 = {60, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68,
						68, 69, 69, 69, 70, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 75, 75, 75, 76, 76, 76,
						77, 77, 77, 78, 78, 78, 79, 79, 79, 79, 80, 80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 83, 84, 84, 84, 85, 85,
						85, 85, 86, 86, 86, 87, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 92, 92, 92, 93, 93, 93,
						94, 94, 94, 95, 95, 95, 96, 96, 96, 96, 97, 97, 97, 98, 98, 98, 99, 99};
	
	int[] femaleMTC27 = {60, 61, 61, 61, 62, 62, 62, 63, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68,
						69, 69, 69, 70, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 74, 75, 75, 75, 76, 76, 76, 77, 77, 77, 
						78, 78, 78, 79, 79, 79, 80, 80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 85, 85, 85, 86, 
						86, 86, 87, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 90, 91, 91, 91, 92, 92, 92, 93, 93, 93, 94, 94, 94, 95, 
						95, 95, 96, 96, 96, 97, 97, 97, 98, 98, 98, 99, 99};
	
	int[] femaleMTC40 = {60, 60, 61, 61, 61, 62, 62, 62, 63, 63, 63, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 68, 68, 68,
						69, 69, 69, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 75, 75, 75, 76, 76, 76, 77, 77, 
						78, 78, 78, 79, 79, 79, 80, 80, 80, 81, 81, 82, 82, 82, 83, 83, 83, 84, 84, 85, 85, 85, 86, 
						86, 86, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 90, 91, 91, 92, 92, 92, 93, 93, 93, 94, 94, 95, 
						95, 95, 96, 96, 96, 97, 97, 98, 98, 98, 99, 99};
	
	int[] femaleMTC46 = {60, 61, 61, 61, 62, 62, 62, 63, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68,
						69, 69, 69, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 74, 75, 75, 75, 76, 76, 76, 77, 77, 77,
						78, 78, 78, 79, 79, 79, 80, 80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 83, 84, 84, 84, 85, 85, 85, 86, 
						86, 86, 87, 87, 87, 88, 88, 88, 89, 89, 89, 90, 90, 91, 91, 91, 92, 92, 92, 93, 93, 93, 94, 94, 94, 95, 
						95, 95, 96, 96, 96, 97, 97, 97, 98, 98, 98, 99, 99, 99, 99};
	
	
	
	//AMMO CAN LIFTS
	int[]maleAMMOMax = {91, 97, 89, 86}; //Reps higher than this == 100pts (times in seconds)
	
	int[] maleAMMO17 = {60, 61, 61, 62, 63, 63, 64, 65, 66, 66, 67, 68, 68, 69, 70, 70, 71, 72, 72, 73, 74, 74, 75, 76, 77, 77, 
						78, 79, 79, 80, 81, 81, 82, 83, 83, 84, 85, 86, 86, 87, 88, 88, 89, 90, 90 ,91, 92, 92, 93, 94, 94, 
						95, 96, 97, 97, 98, 99, 99};
	
	int[] maleAMMO27 = {60, 61, 61, 62, 62, 63, 63, 64, 65, 65, 66, 66, 67, 68, 68, 69, 69, 70, 70, 71, 72, 72, 73, 73, 74, 74,
						75, 76, 76, 77, 77, 78, 79, 79, 80, 80, 81, 81, 82, 83, 83, 84, 84, 85, 86, 86, 87, 87, 88, 88, 89, 90, 90,
						91, 91, 92, 92, 93, 94, 94, 95, 95, 96, 97, 97, 98, 98, 99, 99};
	
	int[] maleAMMO40 = {60, 61, 62, 62, 63, 63, 64, 64, 64, 65, 65, 66, 66, 67, 68, 68, 69, 69, 70, 70, 71, 71, 72, 73, 73, 74, 74,
						75, 75, 76, 76, 77, 77, 78, 79, 79, 79, 80, 80, 81, 81, 82, 82, 83, 84, 84, 85, 85, 86, 86, 87, 87, 88, 88,
						89, 90, 90, 91, 91, 92, 92, 93, 93, 94, 95, 95, 96, 96, 97, 97, 98, 98, 99, 99};
	
	int[] maleAMMO46 = {60, 61, 61, 62, 62, 63, 64, 64, 65, 65, 66, 66, 67, 68, 68, 69, 69, 70, 70, 71, 72, 72, 73, 73, 74, 74, 75, 75,
						76, 77, 77, 78, 78, 79, 79, 80, 81, 81, 82, 82, 83, 83, 84, 85, 85, 86, 86, 87, 87, 88, 89, 89, 90, 90, 91, 91,
						92, 93, 93, 94, 94, 95, 95, 95, 96, 97, 97, 98, 98, 99, 99};
	
	
	
	int[]femaleAMMOMax = {60, 63, 45, 41}; //Times lower than this == 100pts (times in seconds)
	
	
	//START HERE AND VERIFY FEMALES... GOT LOST
	int[] femaleAMMO17 = {60, 61, 62, 63, 64, 65, 66, 67, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 80, 81, 82, 83, 84,
						85, 86, 87, 88, 89, 90, 91, 92, 93, 93, 94, 95, 96, 97, 98, 99};
	
	
	int[] femaleAMMO27 = {60, 61, 62, 62, 63, 64, 65, 66, 66, 67, 68, 69, 70, 70, 71, 72, 73, 74, 74, 75, 76, 77, 78, 78, 79, 80, 81, 
						82, 82, 83, 84, 85, 86, 86, 87, 88, 89, 90, 90, 91, 92, 93, 94, 94, 95,	96, 97, 98, 98, 99};
	
	
	int[] femaleAMMO40 = {60, 61, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 
						88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	
	
	int[] femaleAMMO46 = {60, 61, 62, 63, 64, 65, 66, 68, 69, 70, 71, 73, 74, 75, 76, 78, 79, 80, 81, 83, 84, 85, 86, 88, 
						89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
	
	
	
	//MUF
	
	int[]maleMUFMins = {134, 146, 154, 172}; //Times lower than this == 100pts (times in seconds)
	
	int[] maleMUF17 = {60, 61, 61, 61, 62, 62, 62, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 67, 67, 67, 68, 68, 68, 69, 69, 70, 
						70, 70, 71, 71, 71, 72, 72, 73, 73, 73, 74, 74, 74, 75, 75, 76, 76, 76, 77, 77, 78, 78, 78, 79, 79, 79, 
						80, 80, 81, 81, 81, 82, 82, 82, 83, 83, 84, 84, 84, 85, 85, 85, 86, 86, 87, 87, 87, 88, 88, 88, 89, 89, 
						90, 90, 90, 91, 91, 91, 92, 92, 93, 93, 93, 94, 94, 94, 95, 95, 96, 96, 96, 97, 97, 97, 98, 98, 99, 99};
	
	
	int[] maleMUF27 = {60, 61, 61, 61, 61, 62, 62, 62, 63, 63, 63, 63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 66,  67, 67, 67,
						68, 68, 68, 68, 69, 69, 69, 70, 70, 70, 71, 71, 71, 71, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 75, 75, 
						75, 75, 76, 76, 76, 77, 77, 77, 78, 78, 78, 78, 79, 79, 79, 80, 80, 80, 80, 81, 81, 81, 82, 82, 82, 82, 
						83, 83, 83, 84, 84, 84, 85, 85, 85, 85, 86, 86, 86, 87, 87, 87, 87, 88, 88, 88, 89, 89, 89, 89, 90, 90,
						90, 91, 91, 91, 92, 92, 92, 92, 93, 93, 93, 94, 94, 94, 94, 95, 95, 95, 96, 96, 96, 96, 97, 97, 97, 98, 
						98, 98, 99, 99, 99, 99, 99};
	
	
	
	
	
	
	
	
	
	int[] maleMUF40 = {60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 63, 63, 63, 63, 63, 63, 64, 64, 64, 64, 64, 65, 65, 65, 65, 65,
						66, 66, 66, 66, 66, 67, 67, 67, 67, 67, 67, 68, 68, 68, 68, 68,	69, 69, 69, 69, 69, 70, 70, 70, 70, 70,
						71, 71, 71, 71, 71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 73, 74, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75,
						76, 76, 76, 76, 76, 77, 77, 77, 77, 77, 78, 78, 78, 78, 78, 78, 79, 79, 79, 79, 79, 80, 80, 80, 80, 80,
						81, 81, 81, 81, 81, 82, 82, 82, 82, 82, 82, 83, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 85, 86, 
						86, 86, 86, 86, 86, 87, 87, 87, 87, 87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 90, 90, 90, 90, 90, 90, 91, 
						91, 91, 91, 91, 92, 92, 92, 92, 92, 93, 93, 93, 93, 93, 93, 94, 94, 94, 94, 94, 95, 95, 95, 95, 95, 96, 96, 
						96, 96, 96, 97, 97, 97, 97, 97, 97, 98, 98, 98, 98, 98, 99, 99, 99, 99};
	
	
	
	int[] maleMUF46 = {60, 60, 60, 60, 60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 63, 63, 63, 63, 63, 64, 64, 64, 64, 64, 65, 65, 65, 
						65, 65, 66, 66, 66, 66, 66, 67, 67, 67, 67, 67, 68, 68, 68, 68, 68,	69, 69, 69, 69, 70, 70, 70, 70, 70, 71, 
						71, 71, 71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 73, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75, 76, 76, 76, 76, 
						76, 77, 77, 77, 77, 77, 78, 78, 78, 78, 78, 79, 79, 79, 79, 79, 80, 80, 80, 80, 80, 81, 81, 81, 81, 81, 82, 
						82, 82, 82, 82, 83, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 85, 86, 86, 86, 86, 86, 87, 87, 87, 87, 
						87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 90, 90, 90, 90, 90, 91, 91, 91, 91, 91, 92, 92, 92, 92, 92, 93, 93, 93, 
						93, 93, 94, 94, 94, 94, 94, 95, 95, 95, 95, 95, 96, 96, 96, 96, 96, 97, 97, 97, 97, 97, 98, 98, 98, 98, 98, 99, 
						99, 99, 99};
	
	int[]femaleMUFMins = {181, 187, 201, 224}; //Times lower than this == 100pts (times in seconds)
	
	
	int[] femaleMUF17 = {60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 63, 64, 64, 64, 64, 65, 65, 65, 
						65, 65, 66, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68, 68, 69, 69, 69, 69, 70, 70, 70, 70, 70, 71, 
						71, 71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75, 76, 76, 76, 
						76, 77, 77, 77, 77, 77, 78, 78, 78, 78, 79, 79, 79, 79, 79, 80, 80, 80, 80, 81, 81, 81, 81, 81, 82, 
						82, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 86, 86, 86, 86, 86, 87, 87, 87, 
						87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 91, 91, 92, 92, 92, 92, 93, 93, 93, 
						93, 93, 94, 94, 94, 94, 95, 95, 95, 95, 95, 96, 96, 96, 96, 96, 97, 97, 97, 97, 98, 98, 98, 98, 98, 99, 
						99, 99, 99, 99, 99};
	
	
	
	int[] femaleMUF27 = {60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 63, 64, 64, 64, 64, 65, 65, 65, 
			65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 67, 68, 68, 68, 68,	69, 69, 69, 69, 69, 70, 70, 70, 70, 70, 71, 71, 
			71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 74, 74, 75, 75, 75, 75, 76, 76, 76, 76, 
			76, 77, 77, 77, 77, 78, 78, 78, 78, 78, 79, 79, 79, 79, 80, 80, 80, 80, 80, 81, 81, 81, 81, 82, 
			82, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 86, 86, 86, 86, 86, 87, 87, 87, 
			87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 91, 91, 92, 92, 92, 92, 93, 93, 93, 
			93, 93, 94, 94, 94, 94, 95, 95, 95, 95, 95, 96, 96, 96, 96, 97, 97, 97, 97, 97, 98, 98, 98, 98, 99, 
			99, 99, 99};
	
	
	
	int[] femaleMUF40 = {60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 63, 64, 64, 64, 64, 64, 65, 65, 
			65, 65, 66, 66, 66, 66, 66, 67, 67, 67, 67, 67, 68, 68, 68, 68, 68,	69, 69, 69, 69, 70, 70, 70, 70, 70, 71, 71, 
			71, 71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75, 76, 76, 76, 
			76, 77, 77, 77, 77, 77, 78, 78, 78, 78, 78, 79, 79, 79, 79, 79, 80, 80, 80, 80, 81, 81, 81, 81, 81, 82, 
			82, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 85, 86, 86, 86, 86, 86, 87, 87, 87, 
			87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 91, 91, 92, 92, 92, 92, 92, 93, 93, 93, 
			93, 93, 94, 94, 94, 94, 95, 95, 95, 95, 95, 96, 96, 96, 96, 96, 97, 97, 97, 97, 98, 98, 98, 98, 98,
			99, 99, 99, 99};
	
	
	
	int[] femaleMUF46 = {60, 61, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 64, 64, 64, 64, 65, 65, 65, 
			65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68,	69, 69, 69, 69, 69, 70, 70, 70, 70, 71, 71, 
			71, 71, 72, 72, 72, 72, 73, 73, 73, 73, 73, 74, 74, 74, 74, 75, 75, 75, 75, 76, 76, 76, 
			76, 77, 77, 77, 77, 77, 78, 78, 78, 78, 79, 79, 79, 79, 80, 80, 80, 80, 80, 81, 81, 81, 81, 
			82, 82, 82, 82, 83, 83, 83, 83, 84, 84, 84, 84, 84, 85, 85, 85, 85, 86, 86, 86, 86, 87, 87, 87, 
			87, 88, 88, 88, 88, 88, 89, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 91, 92, 92, 92, 92, 92, 93, 93, 
			93, 93, 94, 94, 94, 94, 95, 95, 95, 95, 96, 96, 96, 96, 96, 97, 97, 97, 97, 98, 98, 98, 98, 99, 99,
			99, 99, 99, 99};
	
	
	
	public AndriosData(){
		
		
	}
	

	/**
	 * Getter Methods
	 */
	
	
	
	
	/**
	 * Setter Methods
	 */
	

	
	


	
	public void write(Context ctx){
		AndriosData writableData = null;
		try {
			writableData = (AndriosData) this.clone();
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		
		
		try {
		
			FileOutputStream fos;
			fos = ctx.openFileOutput("data", Context.MODE_PRIVATE);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(writableData);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			Toast.makeText(ctx, "Error: Writing to file",
					Toast.LENGTH_SHORT).show();
		}
	}













	
}

