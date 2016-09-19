package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasPartIterator theInstanceHasPartIterator = (InstanceHasPartIterator)findAncestorWithClass(this, InstanceHasPartIterator.class);
			pageContext.getOut().print(theInstanceHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

