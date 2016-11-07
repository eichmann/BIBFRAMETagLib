package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSupersedesIterator theMonographSupersedesIterator = (MonographSupersedesIterator)findAncestorWithClass(this, MonographSupersedesIterator.class);
			pageContext.getOut().print(theMonographSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for supersedes tag ");
		}
		return SKIP_BODY;
	}
}
