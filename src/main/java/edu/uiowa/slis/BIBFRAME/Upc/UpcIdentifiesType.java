package edu.uiowa.slis.BIBFRAME.Upc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UpcIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UpcIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(UpcIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UpcIdentifiesIterator theUpcIdentifiesIterator = (UpcIdentifiesIterator)findAncestorWithClass(this, UpcIdentifiesIterator.class);
			pageContext.getOut().print(theUpcIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Upc for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for identifies tag ");
		}
		return SKIP_BODY;
	}
}

