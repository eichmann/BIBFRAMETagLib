package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasInstanceIterator theMonographHasInstanceIterator = (MonographHasInstanceIterator)findAncestorWithClass(this, MonographHasInstanceIterator.class);
			pageContext.getOut().print(theMonographHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

