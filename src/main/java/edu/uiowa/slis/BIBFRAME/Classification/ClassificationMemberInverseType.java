package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationMemberInverseIterator theClassificationMemberInverseIterator = (ClassificationMemberInverseIterator)findAncestorWithClass(this, ClassificationMemberInverseIterator.class);
			pageContext.getOut().print(theClassificationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for member tag ");
		}
		return SKIP_BODY;
	}
}

