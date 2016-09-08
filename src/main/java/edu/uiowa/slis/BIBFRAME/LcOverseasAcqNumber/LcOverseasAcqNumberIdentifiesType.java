package edu.uiowa.slis.BIBFRAME.LcOverseasAcqNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LcOverseasAcqNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LcOverseasAcqNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LcOverseasAcqNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LcOverseasAcqNumberIdentifiesIterator theLcOverseasAcqNumberIdentifiesIterator = (LcOverseasAcqNumberIdentifiesIterator)findAncestorWithClass(this, LcOverseasAcqNumberIdentifiesIterator.class);
			pageContext.getOut().print(theLcOverseasAcqNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LcOverseasAcqNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing LcOverseasAcqNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

