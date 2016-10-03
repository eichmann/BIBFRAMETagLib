package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingBottomObjectPropertyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingBottomObjectPropertyIterator theNothingBottomObjectPropertyIterator = (NothingBottomObjectPropertyIterator)findAncestorWithClass(this, NothingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theNothingBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

