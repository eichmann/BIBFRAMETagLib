package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSupplementsIterator theMonographSupplementsIterator = (MonographSupplementsIterator)findAncestorWithClass(this, MonographSupplementsIterator.class);
			pageContext.getOut().print(theMonographSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for supplements tag ");
		}
		return SKIP_BODY;
	}
}

