package edu.uiowa.slis.BIBFRAME.Coden;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodenIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CodenIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodenIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodenIdentifiesIterator theCodenIdentifiesIterator = (CodenIdentifiesIterator)findAncestorWithClass(this, CodenIdentifiesIterator.class);
			pageContext.getOut().print(theCodenIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Coden for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for identifies tag ");
		}
		return SKIP_BODY;
	}
}

