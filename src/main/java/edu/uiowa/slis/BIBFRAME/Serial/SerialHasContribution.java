package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasContribution.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasContributionIterator theSerialHasContributionIterator = (SerialHasContributionIterator)findAncestorWithClass(this, SerialHasContributionIterator.class);
			pageContext.getOut().print(theSerialHasContributionIterator.getHasContribution());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasContribution tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasContribution tag ");
		}
		return SKIP_BODY;
	}
}

