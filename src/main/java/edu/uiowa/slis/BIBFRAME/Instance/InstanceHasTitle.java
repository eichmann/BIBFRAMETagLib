package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasTitleIterator theInstanceHasTitleIterator = (InstanceHasTitleIterator)findAncestorWithClass(this, InstanceHasTitleIterator.class);
			pageContext.getOut().print(theInstanceHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

