package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDerivedFromIterator theDatasetDerivedFromIterator = (DatasetDerivedFromIterator)findAncestorWithClass(this, DatasetDerivedFromIterator.class);
			pageContext.getOut().print(theDatasetDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

