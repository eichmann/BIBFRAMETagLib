package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasDataSourceIterator theDissertationHasDataSourceIterator = (DissertationHasDataSourceIterator)findAncestorWithClass(this, DissertationHasDataSourceIterator.class);
			pageContext.getOut().print(theDissertationHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

