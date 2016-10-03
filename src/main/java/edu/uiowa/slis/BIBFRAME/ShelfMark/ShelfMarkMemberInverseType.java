package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ShelfMarkMemberInverseIterator theShelfMarkMemberInverseIterator = (ShelfMarkMemberInverseIterator)findAncestorWithClass(this, ShelfMarkMemberInverseIterator.class);
			pageContext.getOut().print(theShelfMarkMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for member tag ");
		}
		return SKIP_BODY;
	}
}

