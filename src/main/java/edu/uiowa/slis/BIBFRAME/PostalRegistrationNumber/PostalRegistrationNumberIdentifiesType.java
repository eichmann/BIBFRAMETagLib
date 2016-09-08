package edu.uiowa.slis.BIBFRAME.PostalRegistrationNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostalRegistrationNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PostalRegistrationNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostalRegistrationNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostalRegistrationNumberIdentifiesIterator thePostalRegistrationNumberIdentifiesIterator = (PostalRegistrationNumberIdentifiesIterator)findAncestorWithClass(this, PostalRegistrationNumberIdentifiesIterator.class);
			pageContext.getOut().print(thePostalRegistrationNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

