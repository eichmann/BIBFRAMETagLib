package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasInstanceIterator theMonographHasInstanceIterator = (MonographHasInstanceIterator)findAncestorWithClass(this, MonographHasInstanceIterator.class);
			pageContext.getOut().print(theMonographHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

