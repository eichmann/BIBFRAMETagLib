package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTopObjectPropertyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingTopObjectPropertyIterator theNothingTopObjectPropertyIterator = (NothingTopObjectPropertyIterator)findAncestorWithClass(this, NothingTopObjectPropertyIterator.class);
			pageContext.getOut().print(theNothingTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

