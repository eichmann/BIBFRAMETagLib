package edu.uiowa.slis.BIBFRAME.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTopObjectPropertyInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NothingTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingTopObjectPropertyInverseIterator theNothingTopObjectPropertyInverseIterator = (NothingTopObjectPropertyInverseIterator)findAncestorWithClass(this, NothingTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theNothingTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

