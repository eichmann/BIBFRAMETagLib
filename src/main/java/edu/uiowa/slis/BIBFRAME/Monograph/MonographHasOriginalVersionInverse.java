package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOriginalVersionInverseIterator theMonographHasOriginalVersionInverseIterator = (MonographHasOriginalVersionInverseIterator)findAncestorWithClass(this, MonographHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMonographHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

