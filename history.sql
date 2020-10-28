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

 Date: 28/10/2020 15:17:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for history
-- ----------------------------
DROP TABLE IF EXISTS `history`;
CREATE TABLE `history`  (
  `id` int(11) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrow` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` datetime(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of history
-- ----------------------------
INSERT INTO `history` VALUES (11, '包包', 'Java基础', '2020-10-27 21:20:12');
INSERT INTO `history` VALUES (22, '涛涛', '活着', '2020-10-27 21:27:02');
INSERT INTO `history` VALUES (77, '张三', '心理学史', '2020-10-27 21:27:29');
INSERT INTO `history` VALUES (44, '李华', '学会提问', '2020-10-27 21:27:55');
INSERT INTO `history` VALUES (44, '李华', '人类简史', '2020-10-27 21:28:38');
INSERT INTO `history` VALUES (11, '包包', '唐诗三百首', '2020-10-27 21:29:09');
INSERT INTO `history` VALUES (11, '包包', '红楼梦', '2020-10-27 21:29:35');
INSERT INTO `history` VALUES (11, '包包', '失控', '2020-10-27 21:32:05');
INSERT INTO `history` VALUES (22, '涛涛', '三国演义', '2020-10-27 21:32:23');
INSERT INTO `history` VALUES (22, '涛涛', '新周刊', '2020-10-27 21:32:38');
INSERT INTO `history` VALUES (22, '涛涛', 'Java高级', '2020-10-27 21:32:54');
INSERT INTO `history` VALUES (55, '华晨宇', '骆驼祥子', '2020-10-27 21:33:26');
INSERT INTO `history` VALUES (55, '华晨宇', '世界观', '2020-10-27 21:34:07');
INSERT INTO `history` VALUES (55, '华晨宇', '心理学与生活', '2020-10-27 21:37:04');

SET FOREIGN_KEY_CHECKS = 1;
