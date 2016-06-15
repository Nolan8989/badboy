/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : lapm

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2012-08-16 08:11:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_unit`
-- ----------------------------
DROP TABLE IF EXISTS `t_unit`;
CREATE TABLE `t_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unitname` varchar(255) NOT NULL,
  `build_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_unit
-- ----------------------------
INSERT INTO `t_unit` VALUES ('1', '一单元', '1');
INSERT INTO `t_unit` VALUES ('2', '二单元', '2');
INSERT INTO `t_unit` VALUES ('3', '三单元', '3');
