package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasDataSourceInverseIterator theTextHasDataSourceInverseIterator = (TextHasDataSourceInverseIterator)findAncestorWithClass(this, TextHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theTextHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

