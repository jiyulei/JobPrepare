##Mysql存储引擎
<a href="http://xfhnever.github.io/blog/2014/09/18/mysql-storageengine/">Mysql（一）-存储引擎</a>

##进行数据库设计时通常需要遵守哪些范式，请列出并说明
 第一范式（1NF）是指数据库表的每一列都是不可分割的基本数据项，同一列中不能有多个值，即实体中的某个属性不能有多个值或者不能有重复的属性。第一范式是为了要排除 重复组 的出现，所采用的方法是要求数据库的每个字段都只能存放单一值，而且每笔记录都要能利用一个惟一的主键来加以识别。

第二范式（2NF）是数据库规范化中所使用的一种正规形式，是在第一范式（1NF）的基础上建立起来的，即满足第二范式（2NF）必须先满足第一范式（1NF）。它的规则是要求数据表里的所有数据都要和该数据表的主键有完全依赖关系；如果有哪些数据只和主键的一部份有关的话，它就不符合第二范式，就得把它们独立出来变成另一个数据表。同时可以得出：如果一个数据表的主键只有单一一个字段的话，它就一定符合第二范式。

第三范式（3NF）是数据库规范化中所使用的一种正规形式，用来检验是否所有非键属性都只和候选键有相关性，也就是说所有非键属性互相之间应该是无关的。满足第三范式（3NF）必须先满足第二范式（2NF）。第三范式和第二范式不同的地方在于，在第三范式里，所有的非键属性都必须和每个候选键有直接相关。简而言之，第三范式（3NF）要求一个数据库表中不包含已在其它表中已包含的非主关键字信息。

BC范式（英语：Boyce-Codd normal form，缩写BCNF）是在第三范式的基础上加上更严格约束，每个BCNF关系是第三范式的子集，有从属关系。它的定义是：如果对于关系模式R中存在的任意一个非平凡函数依赖X->A，都满足X是R的一个候选键，那么关系模式R就属于BCNF。
BCNF与第三范式的不同之处在于，第三范式允许A是主属性（第三范式中不存在非主键被另一个非主键决定），而在BCNF中，任何属性（包括非主键和主键）都不能被非主键所决定。

解释：
与第三范式相比，一个是“任何非关键字段不能”，一个是“任何字段不能”，显然更严格了
侯选关键字或其部分字段不能传递依赖其他的侯选关关键字
注释：
侯选关键字：又叫侯选码，惟一标识一行数据，其真子集不能是侯选关键字，一个表可以存在多个侯选关键字，如用户表的username，userid
主关键字：又叫主键，主码，被选中的用来区分其它行的侯选关键字，一个表只有一个主关键字
部分依赖：(A,B)->C,D,如A->C,则C部分依赖A
传递依赖：A->B->C,则C传递依赖A