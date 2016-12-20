package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceAccompaniedByIterator theInstanceAccompaniedByIterator = (InstanceAccompaniedByIterator)findAncestorWithClass(this, InstanceAccompaniedByIterator.class);
			pageContext.getOut().print(theInstanceAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

