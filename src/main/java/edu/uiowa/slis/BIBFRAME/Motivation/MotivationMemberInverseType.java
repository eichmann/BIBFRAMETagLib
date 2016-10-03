package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationMemberInverseIterator theMotivationMemberInverseIterator = (MotivationMemberInverseIterator)findAncestorWithClass(this, MotivationMemberInverseIterator.class);
			pageContext.getOut().print(theMotivationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for member tag ");
		}
		return SKIP_BODY;
	}
}

