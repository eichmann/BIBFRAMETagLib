package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccShelfMarkMemberInverseIterator theLccShelfMarkMemberInverseIterator = (LccShelfMarkMemberInverseIterator)findAncestorWithClass(this, LccShelfMarkMemberInverseIterator.class);
			pageContext.getOut().print(theLccShelfMarkMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for member tag ");
		}
		return SKIP_BODY;
	}
}

