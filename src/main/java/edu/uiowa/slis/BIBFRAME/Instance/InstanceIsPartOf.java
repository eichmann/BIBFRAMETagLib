package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIsPartOfIterator theInstanceIsPartOfIterator = (InstanceIsPartOfIterator)findAncestorWithClass(this, InstanceIsPartOfIterator.class);
			pageContext.getOut().print(theInstanceIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

