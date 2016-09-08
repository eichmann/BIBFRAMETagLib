package edu.uiowa.slis.BIBFRAME.PostalRegistrationNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostalRegistrationNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PostalRegistrationNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(PostalRegistrationNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostalRegistrationNumberIdentifiesIterator thePostalRegistrationNumberIdentifiesIterator = (PostalRegistrationNumberIdentifiesIterator)findAncestorWithClass(this, PostalRegistrationNumberIdentifiesIterator.class);
			pageContext.getOut().print(thePostalRegistrationNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing PostalRegistrationNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostalRegistrationNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

