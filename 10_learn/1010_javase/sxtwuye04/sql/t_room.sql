/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : lapm

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2012-08-16 08:12:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_room`
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomtype` int(11) DEFAULT NULL,
  `roomname` varchar(255) DEFAULT NULL,
  `roomnum` varchar(255) DEFAULT NULL,
  `unit_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_room
-- ----------------------------
INSERT INTO `t_room` VALUES ('1', null, '401室', null, '2');
INSERT INTO `t_room` VALUES ('2', null, '505室', null, '2');
INSERT INTO `t_room` VALUES ('3', null, '345', null, '1');
INSERT INTO `t_room` VALUES ('4', null, '453', null, '1');
INSERT INTO `t_room` VALUES ('5', null, '546', null, '3');
INSERT INTO `t_room` VALUES ('6', null, '564', null, '3');
