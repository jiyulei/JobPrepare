##前端调试工具
##请解释一下DOCTYPE的作用，有DOCTYPE和没有DOCTYPE有什么区别
DOCTYPE声明是指HTML文档开头处的一行或两行代码，它描述使用哪个DTD。DTD（文档类型定义）是一组机器可读的规则，它们定义XML或HTML的特定版本中允许有什么，不允许有什么。
在解析网页时，浏览器将使用这些规则检查页面的有效性并且采取相应的措施。浏览器通过分析页面的DOCTYPE声明来了解要使用哪个DTD，由此知道要使用HTML的哪个版本。
    
DOCTYPE当前有两种风格，严格（strict）和过渡（transitional）。过渡的目的是帮助开发人员从老版本迁移到新版本，仍然允许使用已经废弃的元素。严格版本禁止使用废弃的元素，从而把内容和表现分隔开。
##XHTML与HTML有什么区别？你觉得应该使用哪一个，并说出理由。
XHTML1.0和HTML4.01之间的主要差异是它遵守XML编码约定。

标签不能重叠,可以嵌套

标签与属性都要小写

标签都要有始有终,要么以</p>形式结束,要么以<br />形式结束

每个属性都要有属性值,并且属性值要在双引号中

别用name用id
##请说说你对web标准的理解
WEB标准不是某一个标准，而是一系列标准的集合。网页主要由三部分组成：结构（Structure）、表现（Presentation）和行为（Behavior）。
对应的标准也分三方面：结构化标准语言主要包括XHTML和XML，表现标准语言主要包括CSS，行为标准主要包括对象模型（如W3C DOM）、ECMAScript等。
这些标准大部分由W3C起草和发布，也有一些是其他标准组织制订的标准，比如ECMA（European Computer Manufacturers Association）的ECMAScript标准。
##java和javascript有什么关系么
虽然Javascript与Java有紧密的联系，但却是两个公司开发的不同的两个产品。Java是Sun公司推出的新一代面向对象的程序设计语言。特别适合于Internet应用程序开发；而Javascript是Sun与Netscape公司联合推出的产品，
是为了扩展Netscape Navigator功能而开发的一种可以嵌入Web页面中的基于对象和事件驱动的解释性语言。且它的前身是Live Script，而Java的前身是Oak语言。下面就对两种语言间的异同作如下比较：
####基于对象和面向对象
Java是一种真正地面向对象的语言，即使是开发简单的程序，也必须设计对象。Javascript是一种脚本语言，它可以用来制作与网络无关的，
实现与用户交互的复杂软件。它是一种基于对象(Object Based)和事件驱动(Event Driver)的编程语言。因而它本身提供了非常丰富的内部对象供设计人员使用。
####解释和编译
两种语言在其浏览器中所执行的方式不一样。Java的源代码在传递到客户端执行之前，必须经过编译，因而在客户端上必须有运行于相应平台之上的仿真器或解释器。
它可以通过编译器或解释器实现独立于某个特定平台而不受编译代码的束缚。Javascript是一种解释件编程语言，
其源代码在发往客户端执行之前不需经过编译，而是将文本格式的字符代码发送到客户端由浏览器解释执行。
####强变量和弱变量
两种语言所采用的变量是不一样的。Java采用强类型变量，即所有变量在编译之前必须作声明。

JavaScript中，采用弱类型，即变量在用前不需作声明，而由解释器在运行时检查其数据类型，
####代码格式不一样
Java是一种与HIML无关的格式，必须通过像HTML中引用外媒体那样进行装载，其代码以字节代码的形式保存在独立的文档中。JavaScript的代码是一种文本字符格式，
可以直接嵌入HTML文档中，并且可动态装载。编写HTML文档就像编辑文本文件一样方便。
####嵌入方式不一样
在HTML文档中，两种编程语言的标识不同，JavaScript使用“<Script Language="JavaScript">”来标识，而Java使用“<applet>...</applet>”来标识。
####静态联编和动态联编
Java采用静态联编，即Java的对象引用必须在编译时进行，以使编译器能够实现强类型检查。
JavaScript采用动态联编，即JavaScript的对象引用在运行时进行检查，如不经编译则无法实现对象引用的检查。


##你怎么理解 web2.0标准的
##前端页面有哪三层构成，都是什么？
网页分成三个层次，即：结构层、表示层、行为层。

网页的结构层（structural layer）由 HTML 或 XHTML 之类的标记语言负责创建。标签，也就是那些出现在尖括号里的单词，
对网页内容的语义含义做出了描述，但这些标签不包含任何关于如何显示有关内容的信息。例如，P 标签表达了这样一种语义：“这是一个文本段。”

网页的表示层（presentation layer） 由 CSS 负责创建。 CSS 对“如何显示有关内容”的问题做出了回答。

网页的行为层（behavior layer）负责回答“内容应该如何对事件做出反应”这一问题。这是 Javascript 语言和 DOM 主宰的领域。
##在web页面上实现打印乘法表
##模块化编程
##浏览器本地存储,存储范围
       flash：Flash 8永久存储
       gears：Google基于gears的永久存储
       localstorage：遵循HTML5草案的存储
       globalstorage：遵循HTML5草案的存储（旧版）
       ie: IE用户数据行为
       cookie：基于Cookies的永久存储。
##父子窗口之间的通信
##一些常见的浏览器 BUG
## eval 为什么不好
##你真的了解HTML吗？ 雅虎面试题
##瀑布流布局或者流式布局是否有了解
##正则表达式有系统学习过吗(看书或网上教程)？有的话就问问简单点的邮箱验证、URL验证， 或者问问 贪婪匹配与懒惰匹配 的理论知识
##都知道有哪些浏览器内核？开发过的项目都兼容哪些浏览器
##都使用和了解过哪些编辑器？都使用和了解过哪些日常工具
##如果让你来制作一个访问量很高的大型网站，你会如何来管理所有CSS文件、JS与图片
##Web开发如何清除缓存