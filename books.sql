/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 28/10/2020 15:14:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('Java基础', '计算机类');
INSERT INTO `books` VALUES ('Java高级', '计算机类');
INSERT INTO `books` VALUES ('数据结构', '学术类');
INSERT INTO `books` VALUES ('Java web', '计算机类');
INSERT INTO `books` VALUES ('活着', '文学类');
INSERT INTO `books` VALUES ('骆驼祥子', '文学类');
INSERT INTO `books` VALUES ('阿Q正传', '文学类');
INSERT INTO `books` VALUES ('学会提问', '心理类');
INSERT INTO `books` VALUES ('这才是心理学', '心理类');
INSERT INTO `books` VALUES ('心理学与生活', '心理类');
INSERT INTO `books` VALUES ('心理学导论', '心理类');
INSERT INTO `books` VALUES ('心理学的故事', '心理类');
INSERT INTO `books` VALUES ('心理学史', '心理类');
INSERT INTO `books` VALUES ('统计学', '社会科学类');
INSERT INTO `books` VALUES ('人类简史', '社会科学类');
INSERT INTO `books` VALUES ('世界观', '社会科学类');
INSERT INTO `books` VALUES ('自由在高处', '社会科学类');
INSERT INTO `books` VALUES ('失控', '社会科学类');
INSERT INTO `books` VALUES ('新周刊', '社会科学类');
INSERT INTO `books` VALUES ('唐诗三百首', '文学类');
INSERT INTO `books` VALUES ('楚辞', '文学类');
INSERT INTO `books` VALUES ('三国演义', '文学类');
INSERT INTO `books` VALUES ('红楼梦', '文学类');

SET FOREIGN_KEY_CHECKS = 1;
