package edu.uiowa.slis.BIBFRAME.Doi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DoiIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DoiIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DoiIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DoiIdentifiesIterator theDoiIdentifiesIterator = (DoiIdentifiesIterator)findAncestorWithClass(this, DoiIdentifiesIterator.class);
			pageContext.getOut().print(theDoiIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Doi for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for identifies tag ");
		}
		return SKIP_BODY;
	}
}

