package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOriginalVersionInverseIterator theMonographHasOriginalVersionInverseIterator = (MonographHasOriginalVersionInverseIterator)findAncestorWithClass(this, MonographHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMonographHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

