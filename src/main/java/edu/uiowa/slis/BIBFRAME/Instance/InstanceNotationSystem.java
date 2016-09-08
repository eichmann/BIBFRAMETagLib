package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceNotationSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceNotationSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceNotationSystem.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceNotationSystemIterator theInstance = (InstanceNotationSystemIterator)findAncestorWithClass(this, InstanceNotationSystemIterator.class);
			pageContext.getOut().print(theInstance.getNotationSystem());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for notationSystem tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for notationSystem tag ");
		}
		return SKIP_BODY;
	}
}

