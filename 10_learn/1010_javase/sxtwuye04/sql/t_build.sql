/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : lapm

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2012-08-16 08:11:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_build`
-- ----------------------------
DROP TABLE IF EXISTS `t_build`;
CREATE TABLE `t_build` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `buildnum` varchar(255) DEFAULT NULL,
  `buildname` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_build
-- ----------------------------
INSERT INTO `t_build` VALUES ('1', '一号楼', '一号楼', null);
INSERT INTO `t_build` VALUES ('2', '二号楼', '二号楼', null);
INSERT INTO `t_build` VALUES ('3', '三号楼', '三号楼', null);
